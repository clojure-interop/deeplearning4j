(ns org.nd4j.linalg.dataset.api.iterator.cache.InMemoryDataSetCache
  "Created by anton on 7/16/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.cache InMemoryDataSetCache]))

(defn ->in-memory-data-set-cache
  "Constructor."
  (^InMemoryDataSetCache []
    (new InMemoryDataSetCache )))

(defn complete?
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`

  returns: true if namespace is fully cached - `boolean`"
  (^Boolean [^InMemoryDataSetCache this ^java.lang.String namespace]
    (-> this (.isComplete namespace))))

(defn set-complete
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`
  value - `boolean`"
  ([^InMemoryDataSetCache this ^java.lang.String namespace ^Boolean value]
    (-> this (.setComplete namespace value))))

(defn get
  "key - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^InMemoryDataSetCache this ^java.lang.String key]
    (-> this (.get key))))

(defn put
  "key - `java.lang.String`
  data-set - `org.nd4j.linalg.dataset.DataSet`"
  ([^InMemoryDataSetCache this ^java.lang.String key ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.put key data-set))))

(defn contains
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InMemoryDataSetCache this ^java.lang.String key]
    (-> this (.contains key))))

