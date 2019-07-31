(ns org.ansj.library.DATDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library DATDictionary]))

(defn ->dat-dictionary
  "Constructor."
  (^DATDictionary []
    (new DATDictionary )))

(defn *-array-length
  "Static Field.

  数组长度

  type: int"
  []
  DATDictionary/arrayLength)

(defn *status
  "c - `char`

  returns: `int`"
  (^Integer [^Character c]
    (DATDictionary/status c)))

(defn *in-system-dic?
  "判断一个词语是否在词典中

  word - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String word]
    (DATDictionary/isInSystemDic word)))

(defn *get-item
  "index - `int`

  returns: `org.ansj.domain.AnsjItem`"
  (^org.ansj.domain.AnsjItem [^Integer index]
    (DATDictionary/getItem index)))

(defn *get-id
  "str - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String str]
    (DATDictionary/getId str)))

