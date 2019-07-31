(ns org.nd4j.jdbc.loader.impl.BaseLoader
  "Base class for loading ndarrays via org.nd4j.jdbc"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jdbc.loader.impl BaseLoader]))

(defn convert
  "Convert an ndarray to a blob

  to-convert - the ndarray to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the converted ndarray - `java.sql.Blob`

  throws: java.sql.SQLException"
  (^java.sql.Blob [^BaseLoader this ^org.nd4j.linalg.api.ndarray.INDArray to-convert]
    (-> this (.convert to-convert))))

(defn load
  "Load an ndarray from a blob

  blob - the blob to load from - `java.sql.Blob`

  returns: the loaded ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.sql.SQLException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLoader this ^java.sql.Blob blob]
    (-> this (.load blob))))

(defn save
  "Save the ndarray

  save - the ndarray to save - `org.nd4j.linalg.api.ndarray.INDArray`
  id - `java.lang.String`

  throws: java.sql.SQLException"
  ([^BaseLoader this ^org.nd4j.linalg.api.ndarray.INDArray save ^java.lang.String id]
    (-> this (.save save id))))

(defn load-for-id
  "Load an ndarray blob given an id

  id - the id to load - `java.lang.String`

  returns: the blob - `java.sql.Blob`

  throws: java.sql.SQLException"
  (^java.sql.Blob [^BaseLoader this ^java.lang.String id]
    (-> this (.loadForID id))))

(defn load-array-for-id
  "Description copied from interface: JDBCNDArrayIO

  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.sql.SQLException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLoader this ^java.lang.String id]
    (-> this (.loadArrayForId id))))

(defn delete
  "Delete the given ndarray

  id - the id of the ndarray to delete - `java.lang.String`

  throws: java.sql.SQLException"
  ([^BaseLoader this ^java.lang.String id]
    (-> this (.delete id))))

