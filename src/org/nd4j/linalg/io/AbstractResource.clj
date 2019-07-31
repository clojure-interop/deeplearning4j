(ns org.nd4j.linalg.io.AbstractResource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io AbstractResource]))

(defn ->abstract-resource
  "Constructor."
  (^AbstractResource []
    (new AbstractResource )))

(defn last-modified
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^AbstractResource this]
    (-> this (.lastModified))))

(defn readable?
  "returns: `boolean`"
  (^Boolean [^AbstractResource this]
    (-> this (.isReadable))))

(defn get-uri
  "returns: `java.net.URI`

  throws: java.io.IOException"
  (^java.net.URI [^AbstractResource this]
    (-> this (.getURI))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractResource this]
    (-> this (.toString))))

(defn create-relative
  "relative-path - `java.lang.String`

  returns: `org.nd4j.linalg.io.Resource`

  throws: java.io.IOException"
  (^org.nd4j.linalg.io.Resource [^AbstractResource this ^java.lang.String relative-path]
    (-> this (.createRelative relative-path))))

(defn get-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractResource this]
    (-> this (.getFilename))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AbstractResource this]
    (-> this (.hashCode))))

(defn get-url
  "returns: `java.net.URL`

  throws: java.io.IOException"
  (^java.net.URL [^AbstractResource this]
    (-> this (.getURL))))

(defn get-file
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^AbstractResource this]
    (-> this (.getFile))))

(defn exists?
  "Description copied from interface: Resource

  returns: `boolean`"
  (^Boolean [^AbstractResource this]
    (-> this (.exists))))

(defn open?
  "returns: `boolean`"
  (^Boolean [^AbstractResource this]
    (-> this (.isOpen))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractResource this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn content-length
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^AbstractResource this]
    (-> this (.contentLength))))

