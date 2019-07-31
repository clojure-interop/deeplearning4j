(ns com.atilika.kuromoji.compile.WordIdMapCompiler$GrowableIntArray
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile WordIdMapCompiler$GrowableIntArray]))

(defn ->growable-int-array
  "Constructor.

  size - `int`"
  (^WordIdMapCompiler$GrowableIntArray [^Integer size]
    (new WordIdMapCompiler$GrowableIntArray size))
  (^WordIdMapCompiler$GrowableIntArray []
    (new WordIdMapCompiler$GrowableIntArray )))

(defn get-array
  "returns: `int[]`"
  ([^WordIdMapCompiler$GrowableIntArray this]
    (-> this (.getArray))))

(defn set
  "index - `int`
  value - `int`"
  ([^WordIdMapCompiler$GrowableIntArray this ^Integer index ^Integer value]
    (-> this (.set index value))))

