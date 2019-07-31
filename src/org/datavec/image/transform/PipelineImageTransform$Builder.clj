(ns org.datavec.image.transform.PipelineImageTransform$Builder
  "Optional builder helper for PipelineImageTransform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.transform PipelineImageTransform$Builder]))

(defn ->builder
  "Constructor."
  (^PipelineImageTransform$Builder []
    (new PipelineImageTransform$Builder )))

(defn set-seed
  "This method sets RNG seet for this pipeline

  seed - `long`

  returns: `org.datavec.image.transform.PipelineImageTransform$Builder`"
  (^org.datavec.image.transform.PipelineImageTransform$Builder [^PipelineImageTransform$Builder this ^Long seed]
    (-> this (.setSeed seed))))

(defn add-image-transform
  "This method adds given transform with given invocation probability to this pipelien

  transform - `org.datavec.image.transform.ImageTransform`
  probability - `java.lang.Double`

  returns: `org.datavec.image.transform.PipelineImageTransform$Builder`"
  (^org.datavec.image.transform.PipelineImageTransform$Builder [^PipelineImageTransform$Builder this ^org.datavec.image.transform.ImageTransform transform ^java.lang.Double probability]
    (-> this (.addImageTransform transform probability)))
  (^org.datavec.image.transform.PipelineImageTransform$Builder [^PipelineImageTransform$Builder this ^org.datavec.image.transform.ImageTransform transform]
    (-> this (.addImageTransform transform))))

(defn build
  "This method returns new PipelineImageTransform instance

  returns: `org.datavec.image.transform.PipelineImageTransform`"
  (^org.datavec.image.transform.PipelineImageTransform [^PipelineImageTransform$Builder this]
    (-> this (.build))))

