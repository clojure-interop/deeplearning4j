(ns org.deeplearning4j.nn.layers.objdetect.DetectedObject
  "A detected object, by an object detection algorithm.
 Note that the dimensions (for center X/Y, width/height) depend on the specific implementation.
 For example, in the Yolo2OutputLayer, the dimensions are grid cell units - for example, with 416x416 input,
 32x downsampling, we have 13x13 grid cells (each corresponding to 32 pixels in the input image). Thus, a centerX
 of 5.5 would be xPixels=5.5x32 = 176 pixels from left. Widths and heights are similar: in this example, a with of 13
 would be the entire image (416 pixels), and a height of 6.5 would be 6.5/13 = 0.5 of the image (208 pixels)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.objdetect DetectedObject]))

(defn ->detected-object
  "Constructor.

  example-number - Index of the example in the current minibatch. For single images, this is always 0 - `int`
  center-x - Center X position of the detected object - `double`
  center-y - Center Y position of the detected object - `double`
  width - Width of the detected object - `double`
  height - Height of the detected object - `double`
  class-predictions - Row vector of class probabilities for the detected object - `org.nd4j.linalg.api.ndarray.INDArray`
  confidence - `double`"
  (^DetectedObject [^Integer example-number ^Double center-x ^Double center-y ^Double width ^Double height ^org.nd4j.linalg.api.ndarray.INDArray class-predictions ^Double confidence]
    (new DetectedObject example-number center-x center-y width height class-predictions confidence)))

(defn get-top-left-xy
  "Get the top left X/Y coordinates of the detected object

  returns: Array of length 2 - top left X and Y - `double[]`"
  ([^DetectedObject this]
    (-> this (.getTopLeftXY))))

(defn get-bottom-right-xy
  "Get the bottom right X/Y coordinates of the detected object

  returns: Array of length 2 - bottom right X and Y - `double[]`"
  ([^DetectedObject this]
    (-> this (.getBottomRightXY))))

(defn get-predicted-class
  "Get the index of the predicted class (based on maximum predicted probability)

  returns: Index of the predicted class (0 to nClasses - 1) - `int`"
  (^Integer [^DetectedObject this]
    (-> this (.getPredictedClass))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DetectedObject this]
    (-> this (.toString))))

