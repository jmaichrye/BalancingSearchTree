This program is a demonstation of a self balancing binary search tree in java.  Implementation was completed in
left-left, left-right, right-right, and right left balancing operations.  Rotations are completing using the
rotateRight and rotateLeft Balancing Search Tree operations from the insert function.  Please see sample run below.  The trees are
displayed showing the root trees on the far left.  For each height increase, more right indentation is used to visually display the
tree.  Enjoy!

/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/tools.jar:/Users/JonMaichrye/IdeaProjects/BalancingSearchTree/out/production/Balancing Search Tree:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain com.jmaichrye.Main
Java self balancing binary search tree - Integers only
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
50
Current Order of the tree:
   50
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
75
Current Order of the tree:
   50
      75
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
100
Current Order of the tree:
      50
   75
      100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
25
Current Order of the tree:
         25
      50
   75
      100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
10
Current Order of the tree:
         10
      25
         50
   75
      100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
30
Current Order of the tree:
         10
      25
         30
   50
      75
         100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
27
Current Order of the tree:
         10
      25
            27
         30
   50
      75
         100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
28
Current Order of the tree:
         10
      25
            27
         28
            30
   50
      75
         100
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
120
Current Order of the tree:
         10
      25
            27
         28
            30
   50
         75
      100
         120
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
130
Current Order of the tree:
         10
      25
            27
         28
            30
   50
         75
      100
         120
            130
Do you want to continue interacting with the tree?
To exit, please enter n or N
1
Please select a choice
1. Insert integer to the tree
2. Search the tree
3. Node Count
1
Enter element to insert:
140
Current Order of the tree:
         10
      25
            27
         28
            30
   50
         75
      100
            120
         130
            140
Do you want to continue interacting with the tree?
To exit, please enter n or N
