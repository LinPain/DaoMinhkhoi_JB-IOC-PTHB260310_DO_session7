# Restaurant Service self-hosted CI runner

1. Create the `restaurant-service` repository on GitHub and push this project.
2. In that repository, open **Settings > Actions > Runners > New self-hosted runner** and copy the short-lived registration token.
3. Copy `.env.example` to `.env`, then set `REPO_URL` and `RUNNER_TOKEN` in `.env`. Do not commit `.env`.
4. From Ubuntu/WSL with Docker Desktop WSL integration enabled, run `docker compose up -d` and inspect `docker compose logs -f`.
5. Confirm the runner is **Idle** in **Settings > Actions > Runners**, then push to `main` to run the workflow.

The runner image is community maintained. Mounting `/var/run/docker.sock` lets jobs build sibling containers through the host daemon; treat jobs on this runner as trusted code because Docker socket access can control the host.
