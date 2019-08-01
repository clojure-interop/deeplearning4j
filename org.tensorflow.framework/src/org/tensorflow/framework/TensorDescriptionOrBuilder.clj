(ns org.tensorflow.framework.TensorDescriptionOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorDescriptionOrBuilder]))

(defn get-dtype-value
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^TensorDescriptionOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-dtype
  "Data type of tensor elements
  .tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^TensorDescriptionOrBuilder this]
    (-> this (.getDtype))))

(defn has-shape?
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^TensorDescriptionOrBuilder this]
    (-> this (.hasShape))))

(defn get-shape
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorDescriptionOrBuilder this]
    (-> this (.getShape))))

(defn get-shape-or-builder
  "Shape of the tensor.
  .tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^TensorDescriptionOrBuilder this]
    (-> this (.getShapeOrBuilder))))

(defn has-allocation-description?
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `boolean`"
  (^Boolean [^TensorDescriptionOrBuilder this]
    (-> this (.hasAllocationDescription))))

(defn get-allocation-description
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^TensorDescriptionOrBuilder this]
    (-> this (.getAllocationDescription))))

(defn get-allocation-description-or-builder
  "Information about the size and allocator used for the data
  .tensorflow.AllocationDescription allocation_description = 4;

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^TensorDescriptionOrBuilder this]
    (-> this (.getAllocationDescriptionOrBuilder))))

