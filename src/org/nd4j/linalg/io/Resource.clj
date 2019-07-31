(ns org.nd4j.linalg.io.Resource
  "Resource"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io Resource]))

(defn last-modified
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^Resource this]
    (-> this (.lastModified))))

(defn readable?
  "returns: `boolean`"
  (^Boolean [^Resource this]
    (-> this (.isReadable))))

(defn get-uri
  "returns: `java.net.URI`

  throws: java.io.IOException"
  (^java.net.URI [^Resource this]
    (-> this (.getURI))))

(defn create-relative
  "var-1 - `java.lang.String`

  returns: `org.nd4j.linalg.io.Resource`

  throws: java.io.IOException"
  (^org.nd4j.linalg.io.Resource [^Resource this ^java.lang.String var-1]
    (-> this (.createRelative var-1))))

(defn get-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^Resource this]
    (-> this (.getFilename))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^Resource this]
    (-> this (.getDescription))))

(defn get-url
  "returns: `java.net.URL`

  throws: java.io.IOException"
  (^java.net.URL [^Resource this]
    (-> this (.getURL))))

(defn get-file
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^Resource this]
    (-> this (.getFile))))

(defn exists?
  "Whether the resource exists on the classpath

  returns: `boolean`"
  (^Boolean [^Resource this]
    (-> this (.exists))))

(defn open?
  "returns: `boolean`"
  (^Boolean [^Resource this]
    (-> this (.isOpen))))

(defn content-length
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^Resource this]
    (-> this (.contentLength))))

