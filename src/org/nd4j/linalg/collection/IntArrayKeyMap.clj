(ns org.nd4j.linalg.collection.IntArrayKeyMap
  "A map for int arrays backed by a TreeMap"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection IntArrayKeyMap]))

(defn ->int-array-key-map
  "Constructor."
  (^IntArrayKeyMap []
    (new IntArrayKeyMap )))

(defn values
  "returns: `java.util.Collection<V>`"
  (^java.util.Collection [^IntArrayKeyMap this]
    (-> this (.values))))

(defn put-all
  "map - `java.util.Map`"
  ([^IntArrayKeyMap this ^java.util.Map map]
    (-> this (.putAll map))))

(defn put
  "ints - `int[]`
  v - `V`

  returns: `V`"
  ([^IntArrayKeyMap this ints v]
    (-> this (.put ints v))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map.Entry<int[],V>>`"
  ([^IntArrayKeyMap this]
    (-> this (.entrySet))))

(defn contains-value
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntArrayKeyMap this ^java.lang.Object o]
    (-> this (.containsValue o))))

(defn remove
  "o - `java.lang.Object`

  returns: `V`"
  ([^IntArrayKeyMap this ^java.lang.Object o]
    (-> this (.remove o))))

(defn key-set
  "returns: `java.util.Set<int[]>`"
  ([^IntArrayKeyMap this]
    (-> this (.keySet))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^IntArrayKeyMap this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^IntArrayKeyMap this]
    (-> this (.size))))

(defn clear
  ""
  ([^IntArrayKeyMap this]
    (-> this (.clear))))

(defn contains-key
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntArrayKeyMap this ^java.lang.Object o]
    (-> this (.containsKey o))))

(defn get
  "o - `java.lang.Object`

  returns: `V`"
  ([^IntArrayKeyMap this ^java.lang.Object o]
    (-> this (.get o))))

