/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.ReleaseStatus;
import io.github.vrchatapi.model.UnityPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * World
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-23T11:11:56.906580800+02:00[Europe/Stockholm]")
public class World {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_URL_OBJECT = "assetUrlObject";
  @SerializedName(SERIALIZED_NAME_ASSET_URL_OBJECT)
  private Object assetUrlObject;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private BigDecimal capacity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private BigDecimal favorites = new BigDecimal("0");

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured = false;

  public static final String SERIALIZED_NAME_HEAT = "heat";
  @SerializedName(SERIALIZED_NAME_HEAT)
  private BigDecimal heat = new BigDecimal("0");

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<List<Object>> instances = null;

  public static final String SERIALIZED_NAME_LABS_PUBLICATION_DATE = "labsPublicationDate";
  @SerializedName(SERIALIZED_NAME_LABS_PUBLICATION_DATE)
  private String labsPublicationDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OCCUPANTS = "occupants";
  @SerializedName(SERIALIZED_NAME_OCCUPANTS)
  private BigDecimal occupants = new BigDecimal("0");

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization = "vrchat";

  public static final String SERIALIZED_NAME_PLUGIN_URL_OBJECT = "pluginUrlObject";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL_OBJECT)
  private Object pluginUrlObject;

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private BigDecimal popularity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PREVIEW_YOUTUBE_ID = "previewYoutubeId";
  @SerializedName(SERIALIZED_NAME_PREVIEW_YOUTUBE_ID)
  private String previewYoutubeId;

  public static final String SERIALIZED_NAME_PRIVATE_OCCUPANTS = "privateOccupants";
  @SerializedName(SERIALIZED_NAME_PRIVATE_OCCUPANTS)
  private BigDecimal privateOccupants = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PUBLIC_OCCUPANTS = "publicOccupants";
  @SerializedName(SERIALIZED_NAME_PUBLIC_OCCUPANTS)
  private BigDecimal publicOccupants = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private OffsetDateTime publicationDate;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PUBLIC;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT = "unityPackageUrlObject";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT)
  private Object unityPackageUrlObject;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private List<UnityPackage> unityPackages = new ArrayList<UnityPackage>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version = new BigDecimal("0");

  public static final String SERIALIZED_NAME_VISITS = "visits";
  @SerializedName(SERIALIZED_NAME_VISITS)
  private BigDecimal visits = new BigDecimal("0");


  public World assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Get assetUrl
   * @return assetUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public World assetUrlObject(Object assetUrlObject) {
    
    this.assetUrlObject = assetUrlObject;
    return this;
  }

   /**
   * Get assetUrlObject
   * @return assetUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getAssetUrlObject() {
    return assetUrlObject;
  }


  public void setAssetUrlObject(Object assetUrlObject) {
    this.assetUrlObject = assetUrlObject;
  }


   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "")

  public String getAuthorId() {
    return authorId;
  }




   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }




   /**
   * Get capacity
   * minimum: 0
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public BigDecimal getCapacity() {
    return capacity;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public World description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Get favorites
   * minimum: 0
   * @return favorites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12024", value = "")

  public BigDecimal getFavorites() {
    return favorites;
  }




  public World featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


   /**
   * Get heat
   * minimum: 0
   * @return heat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public BigDecimal getHeat() {
    return heat;
  }




  public World id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public World imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public World instances(List<List<Object>> instances) {
    
    this.instances = instances;
    return this;
  }

  public World addInstancesItem(List<Object> instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<List<Object>>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<Object>> getInstances() {
    return instances;
  }


  public void setInstances(List<List<Object>> instances) {
    this.instances = instances;
  }


  public World labsPublicationDate(String labsPublicationDate) {
    
    this.labsPublicationDate = labsPublicationDate;
    return this;
  }

   /**
   * Get labsPublicationDate
   * @return labsPublicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getLabsPublicationDate() {
    return labsPublicationDate;
  }


  public void setLabsPublicationDate(String labsPublicationDate) {
    this.labsPublicationDate = labsPublicationDate;
  }


  public World name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public World namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


   /**
   * Get occupants
   * minimum: 0
   * @return occupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "47", value = "")

  public BigDecimal getOccupants() {
    return occupants;
  }




  public World organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "vrchat", required = true, value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public World pluginUrlObject(Object pluginUrlObject) {
    
    this.pluginUrlObject = pluginUrlObject;
    return this;
  }

   /**
   * Get pluginUrlObject
   * @return pluginUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getPluginUrlObject() {
    return pluginUrlObject;
  }


  public void setPluginUrlObject(Object pluginUrlObject) {
    this.pluginUrlObject = pluginUrlObject;
  }


   /**
   * Get popularity
   * minimum: 0
   * @return popularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public BigDecimal getPopularity() {
    return popularity;
  }




  public World previewYoutubeId(String previewYoutubeId) {
    
    this.previewYoutubeId = previewYoutubeId;
    return this;
  }

   /**
   * Get previewYoutubeId
   * @return previewYoutubeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviewYoutubeId() {
    return previewYoutubeId;
  }


  public void setPreviewYoutubeId(String previewYoutubeId) {
    this.previewYoutubeId = previewYoutubeId;
  }


   /**
   * Get privateOccupants
   * minimum: 0
   * @return privateOccupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getPrivateOccupants() {
    return privateOccupants;
  }




   /**
   * Get publicOccupants
   * minimum: 0
   * @return publicOccupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46", value = "")

  public BigDecimal getPublicOccupants() {
    return publicOccupants;
  }




  public World publicationDate(OffsetDateTime publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }


  public World releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public World tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public World addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public World thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public World unityPackageUrlObject(Object unityPackageUrlObject) {
    
    this.unityPackageUrlObject = unityPackageUrlObject;
    return this;
  }

   /**
   * Get unityPackageUrlObject
   * @return unityPackageUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getUnityPackageUrlObject() {
    return unityPackageUrlObject;
  }


  public void setUnityPackageUrlObject(Object unityPackageUrlObject) {
    this.unityPackageUrlObject = unityPackageUrlObject;
  }


  public World unityPackages(List<UnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public World addUnityPackagesItem(UnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   * Get unityPackages
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<UnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(List<UnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public World updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public World version(BigDecimal version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "68", required = true, value = "")

  public BigDecimal getVersion() {
    return version;
  }


  public void setVersion(BigDecimal version) {
    this.version = version;
  }


   /**
   * Get visits
   * minimum: 0
   * @return visits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9988675", required = true, value = "")

  public BigDecimal getVisits() {
    return visits;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    World world = (World) o;
    return Objects.equals(this.assetUrl, world.assetUrl) &&
        Objects.equals(this.assetUrlObject, world.assetUrlObject) &&
        Objects.equals(this.authorId, world.authorId) &&
        Objects.equals(this.authorName, world.authorName) &&
        Objects.equals(this.capacity, world.capacity) &&
        Objects.equals(this.createdAt, world.createdAt) &&
        Objects.equals(this.description, world.description) &&
        Objects.equals(this.favorites, world.favorites) &&
        Objects.equals(this.featured, world.featured) &&
        Objects.equals(this.heat, world.heat) &&
        Objects.equals(this.id, world.id) &&
        Objects.equals(this.imageUrl, world.imageUrl) &&
        Objects.equals(this.instances, world.instances) &&
        Objects.equals(this.labsPublicationDate, world.labsPublicationDate) &&
        Objects.equals(this.name, world.name) &&
        Objects.equals(this.namespace, world.namespace) &&
        Objects.equals(this.occupants, world.occupants) &&
        Objects.equals(this.organization, world.organization) &&
        Objects.equals(this.pluginUrlObject, world.pluginUrlObject) &&
        Objects.equals(this.popularity, world.popularity) &&
        Objects.equals(this.previewYoutubeId, world.previewYoutubeId) &&
        Objects.equals(this.privateOccupants, world.privateOccupants) &&
        Objects.equals(this.publicOccupants, world.publicOccupants) &&
        Objects.equals(this.publicationDate, world.publicationDate) &&
        Objects.equals(this.releaseStatus, world.releaseStatus) &&
        Objects.equals(this.tags, world.tags) &&
        Objects.equals(this.thumbnailImageUrl, world.thumbnailImageUrl) &&
        Objects.equals(this.unityPackageUrlObject, world.unityPackageUrlObject) &&
        Objects.equals(this.unityPackages, world.unityPackages) &&
        Objects.equals(this.updatedAt, world.updatedAt) &&
        Objects.equals(this.version, world.version) &&
        Objects.equals(this.visits, world.visits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetUrlObject, authorId, authorName, capacity, createdAt, description, favorites, featured, heat, id, imageUrl, instances, labsPublicationDate, name, namespace, occupants, organization, pluginUrlObject, popularity, previewYoutubeId, privateOccupants, publicOccupants, publicationDate, releaseStatus, tags, thumbnailImageUrl, unityPackageUrlObject, unityPackages, updatedAt, version, visits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class World {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetUrlObject: ").append(toIndentedString(assetUrlObject)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    heat: ").append(toIndentedString(heat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    labsPublicationDate: ").append(toIndentedString(labsPublicationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pluginUrlObject: ").append(toIndentedString(pluginUrlObject)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    previewYoutubeId: ").append(toIndentedString(previewYoutubeId)).append("\n");
    sb.append("    privateOccupants: ").append(toIndentedString(privateOccupants)).append("\n");
    sb.append("    publicOccupants: ").append(toIndentedString(publicOccupants)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    unityPackageUrlObject: ").append(toIndentedString(unityPackageUrlObject)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
