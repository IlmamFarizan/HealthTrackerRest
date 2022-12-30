<template id="user-activity-overview">
  <app-layout>
    <div>
        <h3>Activities list </h3>
      <br>
      <div>
        <button rel="tooltip" title="Swimming" class="btn btn-info btn-simple btn-link">
          <i class="fa fa-person-swimming" aria-hidden="true"></i>
        </button>
      </div>
    </div>
  </app-layout>
</template>

<script>
Vue.component("user-activity-overview",{
  template: "#user-activity-overview",
  data: () => ({
    activities: [],
  }),
  created() {
    const userId = this.$javalin.pathParams["user-id"];
    axios.get(`/api/users/${userId}/activities`)
        .then(res => this.activities = res.data)
        .catch(() => alert("Error while fetching activities"));
  }
});
</script>
