(ns org.tensorflow.framework.NodeOutputOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeOutputOrBuilder]))

(defn get-slot
  "int32 slot = 1;

  returns: `int`"
  (^Integer [^NodeOutputOrBuilder this]
    (-> this (.getSlot))))

(defn has-tensor-description?
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `boolean`"
  (^Boolean [^NodeOutputOrBuilder this]
    (-> this (.hasTensorDescription))))

(defn get-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^NodeOutputOrBuilder this]
    (-> this (.getTensorDescription))))

(defn get-tensor-description-or-builder
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^NodeOutputOrBuilder this]
    (-> this (.getTensorDescriptionOrBuilder))))

