    ,------. ,--.                      ,---.                           ,--.               
    |  .--. '|  | ,--,--.,--. ,--.    '   .-'  ,--,--.,--,--,--. ,---. |  | ,---.  ,---.  
    |  '--' ||  |' ,-.  | \  '  /     `.  `-. ' ,-.  ||        || .-. ||  || .-. :(  .-'  
    |  | --' |  |\ '-'  |  \   '      .-'    |\ '-'  ||  |  |  || '-' '|  |\   --..-'  `) 
    `--'     `--' `--`--'.-'  /       `-----'  `--`--'`--`--`--'|  |-' `--' `----'`----'  
                         `---'                                  `--'                     
------

# Play Scala Samples | filters

------

### 概要

Global.scala に WithFilters でいろいろ Filter を設定します。
以下の3つのフィルタを実装しています。

#### filters.DoNothingFilter
何もしないフィルタ

#### filters.LoggingFilter
Action の実行時間をログに出力する。
![公式ドキュメント](http://www.playframework.com/documentation/2.1.1/ScalaHttpFilters)にあるコードを簡易にしたもの。

#### filters.AuthenticateFilter
認証がされておらず、リクエストパスが /login か /logout でないリクエストをログインページへリダイレクトするフィルタ。

また、play.filters.csrf.CSRFFilter による CSRF 対策も行なっています。

------

### サンプル詳細

http://localhost:9000/

ログインすると閲覧できるページ。認証してないと /login にリダイレクト。

http://localhost:9000/login

ログインページ。CSRF対策 や Validateのサンプル付き。

http://localhost:9000/logout

ログアウトページ。セッションをリセットする。

------

### 参考サイト

* ScalaHttpFilters : http://www.playframework.com/documentation/2.1.1/ScalaHttpFilters
* Understanding the Play Filter API  : http://jazzy.id.au/default/2013/02/16/understanding_the_play_filter_api.html
* CSRFFilterのサンプルコード : https://github.com/playframework/Play20/tree/master/framework/test/csrftest-scala/app

------

### メモ

* CSRFFilter の Token を Viewに渡すあたりの記述は適当（もう少し綺麗に書かないと）
* CSRFFilter を使う場合は、Build.scala で filters を appDependencies に加える必要がある。
* Filter 周りは2.2で若干変わりそうな感じなので、このコードがいつまで動くかは不明

------

### License

MIT License

