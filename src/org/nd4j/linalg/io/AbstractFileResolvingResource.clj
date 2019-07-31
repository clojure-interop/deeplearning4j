(ns org.nd4j.linalg.io.AbstractFileResolvingResource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io AbstractFileResolvingResource]))

(defn ->abstract-file-resolving-resource
  "Constructor."
  (^AbstractFileResolvingResource []
    (new AbstractFileResolvingResource )))

(defn get-file
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^AbstractFileResolvingResource this]
    (-> this (.getFile))))

(defn exists?
  "Description copied from interface: Resource

  returns: `boolean`"
  (^Boolean [^AbstractFileResolvingResource this]
    (-> this (.exists))))

(defn readable?
  "returns: `boolean`"
  (^Boolean [^AbstractFileResolvingResource this]
    (-> this (.isReadable))))

(defn content-length
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^AbstractFileResolvingResource this]
    (-> this (.contentLength))))

(defn last-modified
  "returns: `long`

  throws: java.io.IOException"
  (^Long [^AbstractFileResolvingResource this]
    (-> this (.lastModified))))

