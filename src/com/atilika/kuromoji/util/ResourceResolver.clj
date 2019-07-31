(ns com.atilika.kuromoji.util.ResourceResolver
  "An adapter to resolve the required resources into data streams."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util ResourceResolver]))

(defn resolve
  "Resolve the resource name and return an open input stream to it.

  resource-name - resource to resolve - `java.lang.String`

  returns: resolved resource stream - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occured resolving the resource"
  (^java.io.InputStream [^ResourceResolver this ^java.lang.String resource-name]
    (-> this (.resolve resource-name))))

