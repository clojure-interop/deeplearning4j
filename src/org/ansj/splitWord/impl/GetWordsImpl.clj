(ns org.ansj.splitWord.impl.GetWordsImpl
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.impl GetWordsImpl]))

(defn ->get-words-impl
  "Constructor.

  构造方法，同时加载词典,传入词语相当于同时调用了setStr() ;

  str - `java.lang.String`"
  (^GetWordsImpl [^java.lang.String str]
    (new GetWordsImpl str))
  (^GetWordsImpl []
    (new GetWordsImpl )))

(defn offe
  "Instance Field.

  offe : 当前词的偏移量

  type: int"
  (^Integer [^GetWordsImpl this]
    (-> this .-offe)))

(defn chars
  "Instance Field.

  type: char[]"
  ([^GetWordsImpl this]
    (-> this .-chars)))

(defn end
  "Instance Field.

  type: int"
  (^Integer [^GetWordsImpl this]
    (-> this .-end)))

(defn i
  "Instance Field.

  type: int"
  (^Integer [^GetWordsImpl this]
    (-> this .-i)))

(defn set-str
  "Description copied from interface: GetWords

  str - 传入的句子 - `java.lang.String`"
  ([^GetWordsImpl this ^java.lang.String str]
    (-> this (.setStr str))))

(defn set-chars
  "chars - `char[]`
  start - `int`
  end - `int`"
  ([^GetWordsImpl this chars ^Integer start ^Integer end]
    (-> this (.setChars chars start end))))

(defn all-words
  "Description copied from interface: GetWords

  returns: 返还分完词后的句子 - `java.lang.String`"
  (^java.lang.String [^GetWordsImpl this]
    (-> this (.allWords))))

(defn get-item
  "returns: `org.ansj.domain.AnsjItem`"
  (^org.ansj.domain.AnsjItem [^GetWordsImpl this]
    (-> this (.getItem))))

(defn get-offe
  "returns: `int`"
  (^Integer [^GetWordsImpl this]
    (-> this (.getOffe))))

