(ns video-fetcher.core
  (:gen-class)
  (:require 
    [hickory.core :as html]
    [hiccup.core :as hc]
        ))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def pdoc (html/parse"<b>code</b>"))
  (println (html/as-hiccup pdoc))
  (println "Hello, World!"))
