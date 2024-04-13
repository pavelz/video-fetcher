(defproject video-fetcher "0.0.0"
  :description "FIXME: write description"
  :url "http://videofeltcher.arslogi.ca"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [hickory "0.7.1"]
                 [org.clojure/clojure "1.11.1"]
                 [hiccup "0.3.0"]
                 ]
  :main ^:skip-aot video-fetcher.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
