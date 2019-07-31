(ns org.deeplearning4j.spark.data.loader.RemoteFileSource
  "Generate a Source from a Hadoop-compatible filesystem"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data.loader RemoteFileSource]))

(defn ->remote-file-source
  "Constructor.

  path - `java.lang.String`
  file-system - `org.apache.hadoop.fs.FileSystem`"
  (^RemoteFileSource [^java.lang.String path ^org.apache.hadoop.fs.FileSystem file-system]
    (new RemoteFileSource path file-system)))

(def *-default-buffer-size
  "Static Constant.

  type: int"
  RemoteFileSource/DEFAULT_BUFFER_SIZE)

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^RemoteFileSource this]
    (-> this (.getInputStream))))

