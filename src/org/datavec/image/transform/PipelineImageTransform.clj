(ns org.datavec.image.transform.PipelineImageTransform
  "Allows creation of image transform pipelines, either sequentially or randomly.
 You have the option of passing in multiple transforms as parameters. If you
 want to create a more complex pipeline, you can pass in a pipeline that looks
 like List<Pair<ImageTransform, Double>>. The Double value is the probability that
 particular element in the pipeline will be executed. This is helpful for creating
 complex pipelines.
 The pipeline can also be randomly shuffled with each transform, further increasing
 the available dataset."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform PipelineImageTransform]))

(defn ->pipeline-image-transform
  "Constructor.

  random - `java.util.Random`
  seed - `long`
  transforms - `java.util.List`
  shuffle - `boolean`"
  (^PipelineImageTransform [^java.util.Random random ^Long seed ^java.util.List transforms ^Boolean shuffle]
    (new PipelineImageTransform random seed transforms shuffle))
  (^PipelineImageTransform [^Long seed ^Boolean shuffle ^org.datavec.image.transform.ImageTransform transforms]
    (new PipelineImageTransform seed shuffle transforms))
  (^PipelineImageTransform [^java.util.List transforms ^Boolean shuffle]
    (new PipelineImageTransform transforms shuffle))
  (^PipelineImageTransform [^org.datavec.image.transform.ImageTransform transforms]
    (new PipelineImageTransform transforms)))

(defn query
  "Description copied from interface: ImageTransform

  coordinates - to transforms (x1, y1, x2, y2, ...) - `float`

  returns: transformed coordinates - `float[]`"
  ([^PipelineImageTransform this ^Float coordinates]
    (-> this (.query coordinates))))

