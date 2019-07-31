(ns org.nd4j.linalg.io.VfsResource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io VfsResource]))

(defn ->vfs-resource
  "Constructor.

  resources - `java.lang.Object`"
  (^VfsResource [^java.lang.Object resources]
    (new VfsResource resources)))

(defn last-modified
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^VfsResource this]
    (-> this (.lastModified))))

(defn readable?
  "returns: `boolean`"
  (^Boolean [^VfsResource this]
    (-> this (.isReadable))))

(defn get-uri
  "returns: `java.net.URI`

  throws: java.io.IOException"
  (^java.net.URI [^VfsResource this]
    (-> this (.getURI))))

(defn create-relative
  "relative-path - `java.lang.String`

  returns: `org.nd4j.linalg.io.Resource`

  throws: java.io.IOException"
  (^org.nd4j.linalg.io.Resource [^VfsResource this ^java.lang.String relative-path]
    (-> this (.createRelative relative-path))))

(defn get-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^VfsResource this]
    (-> this (.getFilename))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^VfsResource this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VfsResource this]
    (-> this (.hashCode))))

(defn get-url
  "returns: `java.net.URL`

  throws: java.io.IOException"
  (^java.net.URL [^VfsResource this]
    (-> this (.getURL))))

(defn get-file
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^VfsResource this]
    (-> this (.getFile))))

(defn exists?
  "Description copied from interface: Resource

  returns: `boolean`"
  (^Boolean [^VfsResource this]
    (-> this (.exists))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^VfsResource this]
    (-> this (.getInputStream))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VfsResource this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn content-length
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^VfsResource this]
    (-> this (.contentLength))))

