(ns com.atilika.kuromoji.util.SimpleResourceResolver
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util SimpleResourceResolver]))

(defn ->simple-resource-resolver
  "Constructor.

  clazz - `java.lang.Class`"
  (^SimpleResourceResolver [^java.lang.Class clazz]
    (new SimpleResourceResolver clazz)))

(defn resolve
  "Description copied from interface: ResourceResolver

  resource-name - resource to resolve - `java.lang.String`

  returns: resolved resource stream - `java.io.InputStream`

  throws: java.io.IOException - if an I/O error occured resolving the resource"
  (^java.io.InputStream [^SimpleResourceResolver this ^java.lang.String resource-name]
    (-> this (.resolve resource-name))))

