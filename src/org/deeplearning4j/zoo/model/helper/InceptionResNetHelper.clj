(ns org.deeplearning4j.zoo.model.helper.InceptionResNetHelper
  "Inception is based on GoogleLeNet configuration of convolutional layers for optimization of
 resources and learning. You can use this module to add Inception to your own custom models.
 The GoogleLeNet paper: https://arxiv.org/abs/1409.4842
 This module is based on the Inception-ResNet paper that combined residual shortcuts with
 Inception-style networks: https://arxiv.org/abs/1602.07261
 Revised and consolidated. Likely needs further tuning for specific applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model.helper InceptionResNetHelper]))

(defn ->inception-res-net-helper
  "Constructor."
  (^InceptionResNetHelper []
    (new InceptionResNetHelper )))

(defn *name-layer
  "block-name - `java.lang.String`
  layer-name - `java.lang.String`
  i - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String block-name ^java.lang.String layer-name ^Integer i]
    (InceptionResNetHelper/nameLayer block-name layer-name i)))

(defn *inception-v-1-res-a
  "Append Inception-ResNet A to a computation graph.

  graph - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  block-name - `java.lang.String`
  scale - `int`
  activation-scale - `double`
  input - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String block-name ^Integer scale ^Double activation-scale ^java.lang.String input]
    (InceptionResNetHelper/inceptionV1ResA graph block-name scale activation-scale input)))

(defn *inception-v-1-res-b
  "Append Inception-ResNet B to a computation graph.

  graph - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  block-name - `java.lang.String`
  scale - `int`
  activation-scale - `double`
  input - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String block-name ^Integer scale ^Double activation-scale ^java.lang.String input]
    (InceptionResNetHelper/inceptionV1ResB graph block-name scale activation-scale input)))

(defn *inception-v-1-res-c
  "Append Inception-ResNet C to a computation graph.

  graph - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  block-name - `java.lang.String`
  scale - `int`
  activation-scale - `double`
  input - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String block-name ^Integer scale ^Double activation-scale ^java.lang.String input]
    (InceptionResNetHelper/inceptionV1ResC graph block-name scale activation-scale input)))

