(ns org.nd4j.imports.descriptors.tensorflow.TensorflowDescriptorParser
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.tensorflow TensorflowDescriptorParser]))

(defn ->tensorflow-descriptor-parser
  "Constructor."
  (^TensorflowDescriptorParser []
    (new TensorflowDescriptorParser )))

(defn *op-descs
  "Get the op descriptors for tensorflow

  returns: the op descriptors for tensorflow - `java.util.Map<java.lang.String,org.tensorflow.framework.OpDef>`

  throws: java.lang.Exception"
  (^java.util.Map []
    (TensorflowDescriptorParser/opDescs )))

