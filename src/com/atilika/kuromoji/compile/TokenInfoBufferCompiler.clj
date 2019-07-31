(ns com.atilika.kuromoji.compile.TokenInfoBufferCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile TokenInfoBufferCompiler]))

(defn ->token-info-buffer-compiler
  "Constructor.

  output - `java.io.OutputStream`
  entries - `java.util.List`"
  (^TokenInfoBufferCompiler [^java.io.OutputStream output ^java.util.List entries]
    (new TokenInfoBufferCompiler output entries)))

(defn put-entries
  "entries - `java.util.List`"
  ([^TokenInfoBufferCompiler this ^java.util.List entries]
    (-> this (.putEntries entries))))

(defn compile
  "throws: java.io.IOException"
  ([^TokenInfoBufferCompiler this]
    (-> this (.compile))))

