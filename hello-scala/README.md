    ,------. ,--.                      ,---.                           ,--.               
    |  .--. '|  | ,--,--.,--. ,--.    '   .-'  ,--,--.,--,--,--. ,---. |  | ,---.  ,---.  
    |  '--' ||  |' ,-.  | \  '  /     `.  `-. ' ,-.  ||        || .-. ||  || .-. :(  .-'  
    |  | --' |  |\ '-'  |  \   '      .-'    |\ '-'  ||  |  |  || '-' '|  |\   --..-'  `) 
    `--'     `--' `--`--'.-'  /       `-----'  `--`--'`--`--`--'|  |-' `--' `----'`----'  
                         `---'                                  `--'                     
------

# Play Scala Samples | hello world

------

### 概要

画面にhello worldと表示するだけのシンプルなアプリです。

------

### 動作イメージ

![動作イメージ](/mwsoft/play_samples/blob/master/hello-scala/public/images/snapshot01.png "")

------

### サンプル詳細

http://localhost:9000/

Ok に直接文字列を渡して text/plain で hello world を出力します。

http://localhost:9000/hello2

View テンプレートを利用して hello world を出力します。

http://localhost:9000/hello3

Action から View に hello world という文字列を引数として渡します。

http://localhost:9000/hello4/hello%20world

URL のパスに hello world という文字列を設定し、 View まで引き渡します。

http://localhost:9000/hello5/hello%20world

hello4 と同じくパスから hello world を取得します。route で正規表現を使っているところが /hello4 と違います。

http://localhost:9000/hello6?msg=hello%20world

クエリ文字列に hello world という文字列を設定し、 View まで引き渡します。

------

### License

MIT License

