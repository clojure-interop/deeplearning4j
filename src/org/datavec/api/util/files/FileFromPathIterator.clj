(ns org.datavec.api.util.files.FileFromPathIterator
  "A simple utility method to convert a Iterator<String> to an Iterator<File>, where each
 String in the original iterator is created via URI.toString()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.files FileFromPathIterator]))

(defn ->file-from-path-iterator
  "Constructor."
  (^FileFromPathIterator []
    (new FileFromPathIterator )))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FileFromPathIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `java.io.File`"
  (^java.io.File [^FileFromPathIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^FileFromPathIterator this]
    (-> this (.remove))))

