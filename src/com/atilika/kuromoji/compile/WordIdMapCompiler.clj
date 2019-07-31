(ns com.atilika.kuromoji.compile.WordIdMapCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile WordIdMapCompiler]))

(defn ->word-id-map-compiler
  "Constructor."
  (^WordIdMapCompiler []
    (new WordIdMapCompiler )))

(defn add-mapping
  "source-id - `int`
  word-id - `int`"
  ([^WordIdMapCompiler this ^Integer source-id ^Integer word-id]
    (-> this (.addMapping source-id word-id))))

(defn write
  "output - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^WordIdMapCompiler this ^java.io.OutputStream output]
    (-> this (.write output))))

(defn compile
  ""
  ([^WordIdMapCompiler this]
    (-> this (.compile))))

