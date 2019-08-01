(ns org.nd4j.nativeblas.ResultWrapperAbstraction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas ResultWrapperAbstraction]))

(defn ->result-wrapper-abstraction
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^ResultWrapperAbstraction [^org.bytedeco.javacpp.Pointer p]
    (new ResultWrapperAbstraction p)))

(defn size
  "returns: `long`"
  (^Long [^ResultWrapperAbstraction this]
    (-> this (.size))))

(defn pointer
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^ResultWrapperAbstraction this]
    (-> this (.pointer))))

