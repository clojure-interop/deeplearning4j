(ns org.deeplearning4j.zoo.model.TextGenerationLSTM
  "LSTM designed for text generation. Can be trained on a corpus of text. For this model, numClasses is
 used to input totalUniqueCharacters for the LSTM input layer.
 Architecture follows this implementation: https://github.com/fchollet/keras/blob/master/examples/lstm_text_generation.py
 Walt Whitman weights are available for generating text from his works, adapted from https://github.com/craigomac/InfiniteMonkeys."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model TextGenerationLSTM]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^TextGenerationLSTM this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^TextGenerationLSTM this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^TextGenerationLSTM this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^TextGenerationLSTM this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^TextGenerationLSTM this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^TextGenerationLSTM this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^TextGenerationLSTM this input-shape]
    (-> this (.setInputShape input-shape))))

