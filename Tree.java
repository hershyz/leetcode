    public void tree(String dir) {

        File directory = new File(dir);
        File[] fList = directory.listFiles();

        int i;
        for (i = 0; i < fList.length; i++) {

            if (!fList[i].isDirectory()) {
                filePaths.add(String.valueOf(fList[i]));
            }
            if (fList[i].isDirectory()) {

                File tempDir = new File(String.valueOf(fList[i]));
                File[] tempList = tempDir.listFiles();

                int j;
                for (j = 0; j < tempList.length; j++) {
                    if (tempList[j].isDirectory()) {
                        tree(String.valueOf(tempList[j]));
                    }
                    else {
                        filePaths.add(String.valueOf(tempList[j]));
                    }
                }
            }
        }
    }
