(ns org.datavec.api.util.files.UriFromPathIterator
  "A simple utility method to convert a Iterator<String> to an Iterator<URI>, where each
 String in the original iterator is a Path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.files UriFromPathIterator]))

(defn ->uri-from-path-iterator
  "Constructor."
  (^UriFromPathIterator []
    (new UriFromPathIterator )))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UriFromPathIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `java.net.URI`"
  (^java.net.URI [^UriFromPathIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^UriFromPathIterator this]
    (-> this (.remove))))

