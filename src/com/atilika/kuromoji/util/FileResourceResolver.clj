(ns com.atilika.kuromoji.util.FileResourceResolver
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util FileResourceResolver]))

(defn ->file-resource-resolver
  "Constructor."
  (^FileResourceResolver []
    (new FileResourceResolver )))

(defn resolve
  "Description copied from interface: ResourceResolver

  file-name - resource to resolve - `java.lang.String`

  returns: resolved resource stream - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occured resolving the resource"
  (^java.io.InputStream [^FileResourceResolver this ^java.lang.String file-name]
    (-> this (.resolve file-name))))

