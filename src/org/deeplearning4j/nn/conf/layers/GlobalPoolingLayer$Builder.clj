(ns org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers GlobalPoolingLayer$Builder]))

(defn ->builder
  "Constructor.

  pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`"
  (^GlobalPoolingLayer$Builder [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type]
    (new GlobalPoolingLayer$Builder pooling-type))
  (^GlobalPoolingLayer$Builder []
    (new GlobalPoolingLayer$Builder )))

(defn pooling-dimensions
  "Pooling dimensions. Note: most of the time, this doesn't need to be set, and the defaults can be used.
  Default for RNN data: pooling dimension 2 (time).
  Default for CNN data: pooling dimensions 2,3 (height and width)
  Default for CNN3D data: pooling dimensions 2,3,4 (depth, height and width)

  pooling-dimensions - Pooling dimensions to use - `int`

  returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder [^GlobalPoolingLayer$Builder this ^Integer pooling-dimensions]
    (-> this (.poolingDimensions pooling-dimensions))))

(defn pooling-type
  "pooling-type - Pooling type for global pooling - `org.deeplearning4j.nn.conf.layers.PoolingType`

  returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder [^GlobalPoolingLayer$Builder this ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type]
    (-> this (.poolingType pooling-type))))

(defn collapse-dimensions
  "Whether to collapse dimensions when pooling or not. Usually you *do* want to do this. Default: true.
  If true:
  - 3d (time series) input with shape [miniBatchSize, vectorSize, timeSeriesLength] -> 2d output [miniBatchSize, vectorSize]
  - 4d (CNN) input with shape [miniBatchSize, channels, height, width] -> 2d output [miniBatchSize, channels]
  - 5d (CNN3D) input with shape [miniBatchSize, channels, depth, height, width] -> 2d output [miniBatchSize, channels]
  If false:
  - 3d (time series) input with shape [miniBatchSize, vectorSize, timeSeriesLength] -> 3d output [miniBatchSize, vectorSize, 1]
  - 4d (CNN) input with shape [miniBatchSize, channels, height, width] -> 2d output [miniBatchSize, channels, 1, 1]
  - 5d (CNN3D) input with shape [miniBatchSize, channels, depth, height, width] -> 2d output [miniBatchSize, channels, 1, 1, 1]

  collapse-dimensions - Whether to collapse the dimensions or not - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder [^GlobalPoolingLayer$Builder this ^Boolean collapse-dimensions]
    (-> this (.collapseDimensions collapse-dimensions))))

(defn pnorm
  "P-norm constant. Only used if using PoolingType.PNORM for the pooling type

  pnorm - P-norm constant - `int`

  returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer$Builder [^GlobalPoolingLayer$Builder this ^Integer pnorm]
    (-> this (.pnorm pnorm))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer [^GlobalPoolingLayer$Builder this]
    (-> this (.build))))

