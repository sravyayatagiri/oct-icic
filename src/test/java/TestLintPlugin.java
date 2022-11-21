
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import schemacrawler.tools.lint.LinterRegistry;

public class TestLintPlugin
{

  @Test
  public void testLintPlugin()
    throws Exception
  {
    final LinterRegistry registry = new LinterRegistry();
    assertThat(registry.hasLinter("funds.AdditionalLinter"), is(true));
  }

}
