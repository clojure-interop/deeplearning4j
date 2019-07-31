(ns org.ansj.library.NatureLibrary
  "这里封装了词性和词性之间的关系.以及词性的索引.这是个好东西. 里面数组是从ict里面找来的. 不是很新.没有语料无法训练"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library NatureLibrary]))

(defn ->nature-library
  "Constructor."
  (^NatureLibrary []
    (new NatureLibrary )))

(defn *get-two-nature-freq
  "获得两个词性之间的频率

  from - `org.ansj.domain.Nature`
  to - `org.ansj.domain.Nature`

  returns: `int`"
  (^Integer [^org.ansj.domain.Nature from ^org.ansj.domain.Nature to]
    (NatureLibrary/getTwoNatureFreq from to)))

(defn *get-two-term-freq
  "获得两个term之间的频率

  from-term - `org.ansj.domain.Term`
  to-term - `org.ansj.domain.Term`

  returns: `int`"
  (^Integer [^org.ansj.domain.Term from-term ^org.ansj.domain.Term to-term]
    (NatureLibrary/getTwoTermFreq from-term to-term)))

(defn *get-nature
  "根据字符串得道词性.没有就创建一个

  nature-str - `java.lang.String`

  returns: `org.ansj.domain.Nature`"
  (^org.ansj.domain.Nature [^java.lang.String nature-str]
    (NatureLibrary/getNature nature-str)))

