(ns org.deeplearning4j.zoo.model.AlexNet
  "AlexNet
 Dl4j's AlexNet model interpretation based on the original paper ImageNet Classification with Deep Convolutional Neural Networks
 and the imagenetExample code referenced.
 References:
 http://papers.nips.cc/paper/4824-imagenet-classification-with-deep-convolutional-neural-networks.pdf
 https://github.com/BVLC/caffe/blob/master/models/bvlc_alexnet/train_val.prototxt
 Model is built in dl4j based on available functionality and notes indicate where there are gaps waiting for enhancements.
 Bias initialization in the paper is 1 in certain layers but 0.1 in the imagenetExample code
 Weight distribution uses 0.1 std for all layers in the paper but 0.005 in the dense layers in the imagenetExample code"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model AlexNet]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^AlexNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^AlexNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^AlexNet this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^AlexNet this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^AlexNet this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^AlexNet this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^AlexNet this input-shape]
    (-> this (.setInputShape input-shape))))

