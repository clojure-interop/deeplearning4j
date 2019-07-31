(ns org.ansj.app.keyword.Keyword
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.keyword Keyword]))

(defn ->keyword
  "Constructor.

  name - `java.lang.String`
  doc-freq - `int`
  weight - `double`"
  (^Keyword [^java.lang.String name ^Integer doc-freq ^Double weight]
    (new Keyword name doc-freq weight))
  (^Keyword [^java.lang.String name ^Double score]
    (new Keyword name score)))

(defn set-name
  "name - `java.lang.String`"
  ([^Keyword this ^java.lang.String name]
    (-> this (.setName name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Keyword this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Keyword this]
    (-> this (.getName))))

(defn set-score
  "score - `double`"
  ([^Keyword this ^Double score]
    (-> this (.setScore score))))

(defn get-score
  "returns: `double`"
  (^Double [^Keyword this]
    (-> this (.getScore))))

(defn update-weight
  "weight - `int`"
  ([^Keyword this ^Integer weight]
    (-> this (.updateWeight weight))))

(defn get-freq
  "returns: `int`"
  (^Integer [^Keyword this]
    (-> this (.getFreq))))

(defn compare-to
  "o - `org.ansj.app.keyword.Keyword`

  returns: `int`"
  (^Integer [^Keyword this ^org.ansj.app.keyword.Keyword o]
    (-> this (.compareTo o))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Keyword this ^java.lang.Object obj]
    (-> this (.equals obj))))

