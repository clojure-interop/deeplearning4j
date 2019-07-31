(ns org.datavec.api.util.files.URIUtil
  "Lightweight utilities for converting files to URI."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.files URIUtil]))

(defn ->uri-util
  "Constructor."
  (^URIUtil []
    (new URIUtil )))

(defn *file-to-uri
  "f - `java.io.File`

  returns: `java.net.URI`"
  (^java.net.URI [^java.io.File f]
    (URIUtil/fileToURI f)))

