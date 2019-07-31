(ns org.nd4j.linalg.dataset.api.iterator.cache.InFileDataSetCache
  "Created by anton on 7/18/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.cache InFileDataSetCache]))

(defn ->in-file-data-set-cache
  "Constructor.

  cache-directory - `java.io.File`"
  (^InFileDataSetCache [^java.io.File cache-directory]
    (new InFileDataSetCache cache-directory)))

(defn complete?
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`

  returns: true if namespace is fully cached - `boolean`"
  (^Boolean [^InFileDataSetCache this ^java.lang.String namespace]
    (-> this (.isComplete namespace))))

(defn set-complete
  "Description copied from interface: DataSetCache

  namespace - `java.lang.String`
  value - `boolean`"
  ([^InFileDataSetCache this ^java.lang.String namespace ^Boolean value]
    (-> this (.setComplete namespace value))))

(defn get
  "key - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^InFileDataSetCache this ^java.lang.String key]
    (-> this (.get key))))

(defn put
  "key - `java.lang.String`
  data-set - `org.nd4j.linalg.dataset.DataSet`"
  ([^InFileDataSetCache this ^java.lang.String key ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.put key data-set))))

(defn contains
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InFileDataSetCache this ^java.lang.String key]
    (-> this (.contains key))))

