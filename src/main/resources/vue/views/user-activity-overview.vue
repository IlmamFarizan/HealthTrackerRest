<template id="user-activity-overview">
  <app-layout>
    <div>
        <h3 class="text-center mb-4">Activities list </h3>
      <div class="row align-items-center">
        <div class="col-md-4 text-center">
          <button rel="tooltip" title="Swimming" class="btn-btn info btn-simple btn-link btn-lg p-4">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTY7acY9JCYUTEqh1vRvI13LJ8Ex7iy5hHrTg&usqp=CAU" width="225px" height="225px">
          </button>
        </div>
        <div class="col-md-4 text-center">
          <button rel="tooltip" title="Swimming" class="btn-btn info btn-simple btn-link btn-lg p-4">
            <img src="https://cdn-icons-png.flaticon.com/512/5778/5778454.png" width="225px" height="225px">
          </button>
        </div>
        <div class="col-md-4 text-center">
          <button rel="tooltip" title="Swimming" class="btn-btn info btn-simple btn-link btn-lg p-4">
            <img src="data:image/png;base64,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"
                 width="225px" height="225px">
          </button>
        </div>
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
