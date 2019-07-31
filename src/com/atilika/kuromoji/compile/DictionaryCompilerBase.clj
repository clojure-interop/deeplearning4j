(ns com.atilika.kuromoji.compile.DictionaryCompilerBase
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile DictionaryCompilerBase]))

(defn ->dictionary-compiler-base
  "Constructor."
  (^DictionaryCompilerBase []
    (new DictionaryCompilerBase )))

(defn build
  "input-dirname - `java.lang.String`
  output-dirname - `java.lang.String`
  encoding - `java.lang.String`
  compact-tries - `boolean`

  throws: java.io.IOException"
  ([^DictionaryCompilerBase this ^java.lang.String input-dirname ^java.lang.String output-dirname ^java.lang.String encoding ^Boolean compact-tries]
    (-> this (.build input-dirname output-dirname encoding compact-tries))))

