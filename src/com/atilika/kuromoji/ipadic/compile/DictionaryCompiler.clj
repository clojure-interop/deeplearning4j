(ns com.atilika.kuromoji.ipadic.compile.DictionaryCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic.compile DictionaryCompiler]))

(defn ->dictionary-compiler
  "Constructor."
  (^DictionaryCompiler []
    (new DictionaryCompiler )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.io.IOException"
  ([args]
    (DictionaryCompiler/main args)))

