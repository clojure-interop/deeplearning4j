(ns org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.objdetect Yolo2OutputLayer$Builder]))

(defn ->builder
  "Constructor."
  (^Yolo2OutputLayer$Builder []
    (new Yolo2OutputLayer$Builder )))

(defn lambda-coord
  "Loss function coefficient for position and size/scale components of the loss function.
  Default (as per paper): 5

  lambda-coord - Lambda value for size/scale component of loss function - `double`

  returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder [^Yolo2OutputLayer$Builder this ^Double lambda-coord]
    (-> this (.lambdaCoord lambda-coord))))

(defn lambba-no-obj
  "Loss function coefficient for the \"no object confidence\" components of the loss function.
  Default (as per paper): 0.5

  lambda-no-obj - Lambda value for no-object (confidence) component of the loss function - `double`

  returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder [^Yolo2OutputLayer$Builder this ^Double lambda-no-obj]
    (-> this (.lambbaNoObj lambda-no-obj))))

(defn loss-position-scale
  "Loss function for position/scale component of the loss function

  loss-position-scale - Loss function for position/scale - `org.nd4j.linalg.lossfunctions.ILossFunction`

  returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder [^Yolo2OutputLayer$Builder this ^org.nd4j.linalg.lossfunctions.ILossFunction loss-position-scale]
    (-> this (.lossPositionScale loss-position-scale))))

(defn loss-class-predictions
  "Loss function for the class predictions - defaults to L2 loss (i.e., sum of squared errors, as per the
  paper), however Loss MCXENT could also be used (which is more common for classification).

  loss-class-predictions - Loss function for the class prediction error component of the YOLO loss function - `org.nd4j.linalg.lossfunctions.ILossFunction`

  returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder [^Yolo2OutputLayer$Builder this ^org.nd4j.linalg.lossfunctions.ILossFunction loss-class-predictions]
    (-> this (.lossClassPredictions loss-class-predictions))))

(defn bounding-box-priors
  "Bounding box priors dimensions [width, height]. For N bounding boxes, input has shape [rows, columns] = [N, 2]
  Note that dimensions should be specified as fraction of grid size. For example, a network with 13x13 output,
  a value of 1.0 would correspond to one grid cell; a value of 13 would correspond to the entire image.

  bounding-boxes - Bounding box prior dimensions (width, height) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer$Builder [^Yolo2OutputLayer$Builder this ^org.nd4j.linalg.api.ndarray.INDArray bounding-boxes]
    (-> this (.boundingBoxPriors bounding-boxes))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.objdetect.Yolo2OutputLayer [^Yolo2OutputLayer$Builder this]
    (-> this (.build))))

