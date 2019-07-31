(ns org.ansj.library.NgramLibrary
  "两个词之间的关联"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library NgramLibrary]))

(defn ->ngram-library
  "Constructor."
  (^NgramLibrary []
    (new NgramLibrary )))

(defn *get-two-word-freq
  "查找两个词与词之间的频率

  from - `org.ansj.domain.Term`
  to - `org.ansj.domain.Term`

  returns: `int`"
  (^Integer [^org.ansj.domain.Term from ^org.ansj.domain.Term to]
    (NgramLibrary/getTwoWordFreq from to)))

