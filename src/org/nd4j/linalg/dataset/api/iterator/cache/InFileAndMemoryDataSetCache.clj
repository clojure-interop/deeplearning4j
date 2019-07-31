(ns org.nd4j.linalg.dataset.api.iterator.cache.InFileAndMemoryDataSetCache
  "Created by anton on 7/20/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.cache InFileAndMemoryDataSetCache]))

(defn ->in-file-and-memory-data-set-cache
  "Constructor.

  cache-directory - `java.io.File`"
  (^InFileAndMemoryDataSetCache [^java.io.File cache-directory]
    (new InFileAndMemoryDataSetCache cache-directory)))

(defn complete?
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`

  returns: true if namespace is fully cached - `boolean`"
  (^Boolean [^InFileAndMemoryDataSetCache this ^java.lang.String namespace]
    (-> this (.isComplete namespace))))

(defn set-complete
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`
  value - `boolean`"
  ([^InFileAndMemoryDataSetCache this ^java.lang.String namespace ^Boolean value]
    (-> this (.setComplete namespace value))))

(defn get
  "key - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^InFileAndMemoryDataSetCache this ^java.lang.String key]
    (-> this (.get key))))

(defn put
  "key - `java.lang.String`
  data-set - `org.nd4j.linalg.dataset.DataSet`"
  ([^InFileAndMemoryDataSetCache this ^java.lang.String key ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.put key data-set))))

(defn contains
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InFileAndMemoryDataSetCache this ^java.lang.String key]
    (-> this (.contains key))))

