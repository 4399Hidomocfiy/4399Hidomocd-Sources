package bsh.util;

import bsh.NameSource;
import bsh.StringUtil;
import java.util.ArrayList;
import java.util.List;

public class NameCompletionTable extends ArrayList implements NameCompletion {
    List sources;
    NameCompletionTable table;

    public void add(NameSource nameSource) {
        if (this.sources == null) {
            this.sources = new ArrayList();
        }
        this.sources.add(nameSource);
    }

    public void add(NameCompletionTable nameCompletionTable) {
        if (this.table == null) {
            this.table = nameCompletionTable;
            return;
        }
        throw new RuntimeException("Unimplemented usage error");
    }

    @Override // bsh.util.NameCompletion
    public String[] completeName(String str) {
        ArrayList arrayList = new ArrayList();
        getMatchingNames(str, arrayList);
        if (arrayList.size() == 0) {
            return new String[0];
        }
        String str2 = (String) arrayList.get(0);
        for (int i = 1; i < arrayList.size() && str2.length() > 0; i++) {
            str2 = StringUtil.maxCommonPrefix(str2, (String) arrayList.get(i));
            if (str2.equals(str)) {
                break;
            }
        }
        if (str2.length() <= str.length()) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{str2};
    }

    /* access modifiers changed from: protected */
    public void getMatchingNames(String str, List list) {
        for (int i = 0; i < size(); i++) {
            String str2 = (String) get(i);
            if (str2.startsWith(str)) {
                list.add(str2);
            }
        }
        NameCompletionTable nameCompletionTable = this.table;
        if (nameCompletionTable != null) {
            nameCompletionTable.getMatchingNames(str, list);
        }
        if (this.sources != null) {
            for (int i2 = 0; i2 < this.sources.size(); i2++) {
                String[] allNames = ((NameSource) this.sources.get(i2)).getAllNames();
                for (int i3 = 0; i3 < allNames.length; i3++) {
                    if (allNames[i3].startsWith(str)) {
                        list.add(allNames[i3]);
                    }
                }
            }
        }
    }
}
