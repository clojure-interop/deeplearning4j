(ns org.nd4j.linalg.util.LinkedMultiValueMap
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util LinkedMultiValueMap]))

(defn ->linked-multi-value-map
  "Constructor.

  initial-capacity - `int`"
  (^LinkedMultiValueMap [^Integer initial-capacity]
    (new LinkedMultiValueMap initial-capacity))
  (^LinkedMultiValueMap []
    (new LinkedMultiValueMap )))

(defn values
  "returns: `java.util.Collection<java.util.List<V>>`"
  (^java.util.Collection [^LinkedMultiValueMap this]
    (-> this (.values))))

(defn get-first
  "key - `K`

  returns: `V`"
  ([^LinkedMultiValueMap this key]
    (-> this (.getFirst key))))

(defn put-all
  "m - `java.util.Map`"
  ([^LinkedMultiValueMap this ^java.util.Map m]
    (-> this (.putAll m))))

(defn put
  "key - `K`
  value - `java.util.List`

  returns: `java.util.List<V>`"
  (^java.util.List [^LinkedMultiValueMap this key ^java.util.List value]
    (-> this (.put key value))))

(defn set-all
  "values - `java.util.Map`"
  ([^LinkedMultiValueMap this ^java.util.Map values]
    (-> this (.setAll values))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map.Entry<K,java.util.List<V>>>`"
  (^java.util.Set [^LinkedMultiValueMap this]
    (-> this (.entrySet))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LinkedMultiValueMap this]
    (-> this (.toString))))

(defn contains-value
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LinkedMultiValueMap this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn remove
  "key - `java.lang.Object`

  returns: `java.util.List<V>`"
  (^java.util.List [^LinkedMultiValueMap this ^java.lang.Object key]
    (-> this (.remove key))))

(defn key-set
  "returns: `java.util.Set<K>`"
  (^java.util.Set [^LinkedMultiValueMap this]
    (-> this (.keySet))))

(defn to-single-value-map
  "returns: `java.util.Map<K,V>`"
  (^java.util.Map [^LinkedMultiValueMap this]
    (-> this (.toSingleValueMap))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LinkedMultiValueMap this]
    (-> this (.hashCode))))

(defn add
  "key - `K`
  value - `V`"
  ([^LinkedMultiValueMap this key value]
    (-> this (.add key value))))

(defn set
  "key - `K`
  value - `V`"
  ([^LinkedMultiValueMap this key value]
    (-> this (.set key value))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^LinkedMultiValueMap this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^LinkedMultiValueMap this]
    (-> this (.size))))

(defn clear
  ""
  ([^LinkedMultiValueMap this]
    (-> this (.clear))))

(defn contains-key
  "key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LinkedMultiValueMap this ^java.lang.Object key]
    (-> this (.containsKey key))))

(defn get
  "key - `java.lang.Object`

  returns: `java.util.List<V>`"
  (^java.util.List [^LinkedMultiValueMap this ^java.lang.Object key]
    (-> this (.get key))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LinkedMultiValueMap this ^java.lang.Object obj]
    (-> this (.equals obj))))

