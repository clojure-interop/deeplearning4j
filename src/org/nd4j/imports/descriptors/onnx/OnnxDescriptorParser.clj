(ns org.nd4j.imports.descriptors.onnx.OnnxDescriptorParser
  "Load all of the onnx op descriptors from the classpath."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.onnx OnnxDescriptorParser]))

(defn ->onnx-descriptor-parser
  "Constructor."
  (^OnnxDescriptorParser []
    (new OnnxDescriptorParser )))

(defn *onnx-op-descriptors
  "Get the onnx op descriptors by name

  returns: the onnx op descriptors by name - `java.util.Map<java.lang.String,org.nd4j.imports.descriptors.onnx.OpDescriptor>`

  throws: java.lang.Exception"
  (^java.util.Map []
    (OnnxDescriptorParser/onnxOpDescriptors )))

