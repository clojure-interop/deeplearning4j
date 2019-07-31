(ns com.atilika.kuromoji.compile.Compiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile Compiler]))

(defn compile
  "throws: java.io.IOException"
  ([^Compiler this]
    (-> this (.compile))))

