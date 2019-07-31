(ns org.deeplearning4j.arbiter.optimize.generator.util.SerializedSupplier
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.generator.util SerializedSupplier]))

(defn ->serialized-supplier
  "Constructor.

  obj - `T`"
  (^SerializedSupplier [obj]
    (new SerializedSupplier obj)))

(defn get
  "returns: Result - `T`"
  ([^SerializedSupplier this]
    (-> this (.get))))

